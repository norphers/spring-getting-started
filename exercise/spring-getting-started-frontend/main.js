function greetings(){

  var text = document.getElementById('name').value;

    $.ajax({
      type:'GET',
      url: "http://localhost:8080/" + text,
      success: function(response){
        alert(response);
      },
      error: function(error){
        alert(error);
      }
    });

    console.log("Put click")

}