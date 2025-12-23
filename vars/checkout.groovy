def call( string repourl, string branchname) {
  git url: repourl, branch:branchname
  echo "clonned ${repourl} on branch ${branchname}"
}
  
