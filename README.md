# demo 어플리케이션
# Spring Eureka Client 탑재
# Jenkinsfile 

stage('==========argocd deploy image========'){

  withCredentials([usernamePassword(credentialsId: "github",
                                                  usernameVariable: 'SCM_USER',
                                                  passwordVariable: 'SCM_PASSWORD')]) {
    sh """
        cat /var/lib/jenkins/workspace/springboot/k8s/client_deploy.yaml && \
        git config --global user.name "themapisto"
        git config --global user.email "themapisto@naver.com"
        git remote -v
        git config remote.origin.url 'https://themapisto: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@github.com/themapisto/demo.git'
        git config --global credential.helper store
        sed -i 's/1.123/${env.BUILD_NUMBER}/g' /var/lib/jenkins/workspace/springboot/k8s/client_deploy.yaml && \
        git add . && git commit -m '[Argo] Docker image tag: ${env.BUILD_NUMBER}' && \
        git push -u origin main
    """
