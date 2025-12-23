def call(String repourl, String branch = 'main') {
    git url: repourl, branch: branch
    echo "Cloned ${repourl} on branch ${branch}"
}
