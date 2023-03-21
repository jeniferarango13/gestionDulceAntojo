function guardar () {
    db.collection("usuarios").add({
        referencia: document.getElementById("referencia").value,
        nombredelproducto: document.getElementById("Nombre").value,
        Precio: document.getElementById("Precio").value
        
    })
    .then((docRef) => {
        alert("registro exitoso");
    })
    .catch((error) => {
        alert("error en el registro");;
    });
}