def call(String repourl, String branchname) {
    git url: repourl, branch: branchname
    echo "Cloned ${repourl} on branch ${branchname}"
}
