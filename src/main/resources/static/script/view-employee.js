function onDelete(employeeId){
    if(confirm("Do you want to remove")){
        location.href = "/removeemployee?id=" + employeeId;
    }
}
