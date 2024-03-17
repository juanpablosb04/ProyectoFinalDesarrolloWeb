const num = document.getElementById('num');
const btnMenosProdct1 = document.getElementById('btnMenosProdct1');
const btnMasProdct1 = document.getElementById('btnMasProdct1');

let contador = 0;

function incrementar() {
  contador++;
  num.textContent = contador;
}


function decrementar() {
  if(contador > 0){
  contador--;
  num.textContent = contador;
  }
}

btnMasProdct1.addEventListener('click', incrementar);
btnMenosProdct1.addEventListener('click', decrementar);

/*Fin de Producto 1*/

const num2 = document.getElementById('num2');
const btnMenosProdct2 = document.getElementById('btnMenosProdct2');
const btnMasProdct2 = document.getElementById('btnMasProdct2');

let contador2 = 0;

function incrementar2() {
  contador2++;
  num2.textContent = contador2;
}


function decrementar2() {
  if(contador2 > 0){
  contador2--;
  num2.textContent = contador2;
  }
}

btnMasProdct2.addEventListener('click', incrementar2);
btnMenosProdct2.addEventListener('click', decrementar2);

/*Fin de Producto 2*/

const num3 = document.getElementById('num3');
const btnMenosProdct3 = document.getElementById('btnMenosProdct3');
const btnMasProdct3 = document.getElementById('btnMasProdct3');

let contador3 = 0;

function incrementar3() {
  contador3++;
  num3.textContent = contador3;
}


function decrementar3() {
  if(contador3 > 0){
  contador3--;
  num3.textContent = contador3;
  }
}

btnMasProdct3.addEventListener('click', incrementar3);
btnMenosProdct3.addEventListener('click', decrementar3);

/*Fin de Producto 3*/

const num4 = document.getElementById('num4');
const btnMenosProdct4 = document.getElementById('btnMenosProdct4');
const btnMasProdct4 = document.getElementById('btnMasProdct4');

let contador4 = 0;

function incrementar4() {
  contador4++;
  num4.textContent = contador4;
}


function decrementar4() {
  if(contador4 > 0){
  contador4--;
  num4.textContent = contador4;
  }
}

btnMasProdct4.addEventListener('click', incrementar4);
btnMenosProdct4.addEventListener('click', decrementar4);

/*Fin de Producto 4*/

const num5 = document.getElementById('num5');
const btnMenosProdct5 = document.getElementById('btnMenosProdct5');
const btnMasProdct5 = document.getElementById('btnMasProdct5');

let contador5 = 0;

function incrementar5() {
  contador5++;
  num5.textContent = contador5;
}


function decrementar5() {
  if(contador5 > 0){
  contador5--;
  num5.textContent = contador5;
  }
}

btnMasProdct5.addEventListener('click', incrementar5);
btnMenosProdct5.addEventListener('click', decrementar5);

/*Fin de Producto 5*/