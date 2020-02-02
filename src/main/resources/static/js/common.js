
// document ready function ends here
$(document).ready(function(){
  //Date JS starts here
  var monthNames = [ "Jan", "Feb", "Mar", "Apr", "May", "June",
      "July", "Aug", "Sept", "Oct", "Nov", "Dec" ];
  var dayNames= ["Sun","Mon","Tue","Wed","Thu","Fri","Sat"]

  var newDate = new Date();
  newDate.setDate(newDate.getDate());    
  $('#Date').html(dayNames[newDate.getDay()] + " , " + newDate.getDate() + ' ' + monthNames[newDate.getMonth()] + ' ' + newDate.getFullYear());
  //DateJS End here

});// document ready function ends here

//tooltip
$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})