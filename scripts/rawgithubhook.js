function fetchSolution(target, challengeName, statementName) {
  // Normalize the Display of the Rows
  let rows = target.parentElement.children;
  for (let i = 0; i < rows.length; i++) {
    rows[i].classList.remove('table-row-active');
  }
  // Highlight the Selected Row
  target.classList.add('table-row-active');
  document.getElementById('solution').innerHTML = loadAnimationMarkup;
  setTimeout(function () {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        // Insert Fetched Code into the Solution Container
        let rawCode = `<pre><code class="java" id="program">${xhttp.responseText}</code></pre>`;
        document.getElementById('solution').innerHTML = rawCode;
        // Add Credits for GitHub, RawGit & Highlight.js
        document.getElementById('solution').innerHTML +=
          `<div class="highlightjs-credit">Syntax Beautified By: <a href="https://highlightjs.org/" target="_blank">Highlight.js</a><br />Code Fetched from <a href="https://github.com/" target="_blank">GitHub</a> via <a href="https://rawgit.com/" target="_blank">RawGit</a></div>`;
        // Highligh the Code Container 'program'
        hljs.highlightBlock(document.getElementById('program'));
        // Scroll into the view of Solution (Mainly for Mobile Devices)
        document.getElementById('solution').scrollIntoView();
      }
    };
    xhttp.open("GET", `https://cdn.rawgit.com/abhisekjuneja/HackerRank-Challenge/master/${challengeName}/${statementName}`,
      true);
    xhttp.send();
  }, 1000);
}

let loadAnimationMarkup = `<div class="spinner">
<div class="rect1"></div>
<div class="rect2"></div>
<div class="rect3"></div>
<div class="rect4"></div>
<div class="rect5"></div>
</div>`;