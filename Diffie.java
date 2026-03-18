<!DOCTYPE html>
<html>
<body>

<h2>Diffie-Hellman</h2>

<input id="p" placeholder="p">
<input id="g" placeholder="g">
<input id="a" placeholder="a">
<input id="b" placeholder="b">

<button onclick="calc()">Generate</button>

<p>Alice Public: <span id="A"></span></p>
<p>Bob Public: <span id="B"></span></p>
<p>Alice Key: <span id="KA"></span></p>
<p>Bob Key: <span id="KB"></span></p>

<script>
const modExp = (base, exp, mod) => {
  let r = 1;
  while (exp--) r = r * base % mod;
  return r;
};

function calc() {
  let p = +document.getElementById("p").value;
  let g = +document.getElementById("g").value;
  let a = +document.getElementById("a").value;
  let b = +document.getElementById("b").value;

  let A = modExp(g, a, p);
  let B = modExp(g, b, p);

  document.getElementById("A").innerText = A;
  document.getElementById("B").innerText = B;
  document.getElementById("KA").innerText = modExp(B, a, p);
  document.getElementById("KB").innerText = modExp(A, b, p);
}
</script>

</body>
</html>