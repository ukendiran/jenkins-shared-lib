def call() {
    return [
        git_name: 'petplan-digital/devops-automation',
        credentialsId: 'git-fdp-prospect-pet-service',
        url: 'git@bitbucket.org:petplan-digital/devops-automation.git'
    ]
}

def another() {
    return [
        git_name: 'devops-automation',
        credentialsId: 'git-fdp-prospect-pet-service',
        url: 'devops-automation.git'
    ]
}
