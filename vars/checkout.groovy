def call(String repoUrl, String branch = 'main') {
    git url: repoUrl, branch: branch
    echo "Cloned ${repoUrl} on branch ${branch}"
}
