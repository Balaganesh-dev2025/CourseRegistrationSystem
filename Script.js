function showCourses(){
    fetch("http://localhost:8080/api/Course/available")
    .then((response) => response.json())
    .then((data)=> {
        const dataTable = document.getElementById("coursetable");

        data.forEach(course => {
            var row = `
            
            <tr>
                <td> ${course.id} </td>
                <td> ${course.coursename} </td>
                <td> ${course.tutor} </td>
                <td> ${course.duration}</td>
            
            </tr>
            
            `

            dataTable.innerHTML += row;
        });
    })
};



function showEnrolledStudents(){
    fetch("http://localhost:8080/api/Course/registered")
    .then((response)=> response.json())
    .then((regdata)=> {

        const enrolledStudData = document.getElementById("enrolledtable");

        regdata.forEach(enroll =>{

            var row = `
            
            <tr>

                <td> ${enroll.id} </td>
                <td> ${enroll.name} </td>
                <td> ${enroll.emailId} </td>
                <td> ${enroll.courseName} </td>
            
            
            </tr>
            
            
            `

            enrolledStudData.innerHTML += row;


        })
    })

}