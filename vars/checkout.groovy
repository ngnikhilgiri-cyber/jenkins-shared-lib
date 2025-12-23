def call(string repourl, string branch:main) {
  git url: repourl, branch:branch
  echo "clonned ${repourl} on branch ${branch}"
}
  
