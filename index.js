const userList = [ 
    { "id": 1, 
    "email": "george.bluth@reqres.in",
     "first_name": "George", 
     "last_name": "Bluth",
      "avatar": "https://reqres.in/img/faces/1-image.jpg" },
     { "id": 2, 
     "email": "janet.weaver@reqres.in",
      "first_name": "Janet", "last_name": "Weaver",
       "avatar": "https://reqres.in/img/faces/2-image.jpg" },
      { "id": 3, "email": "emma.wong@reqres.in", "first_name": "Emma", "last_name": "Wong", "avatar": "https://reqres.in/img/faces/3-image.jpg" }, 
      { "id": 4, "email": "eve.holt@reqres.in", "first_name": "Eve", "last_name": "Holt", "avatar": "https://reqres.in/img/faces/4-image.jpg" }, 
      { "id": 5, "email": "charles.morris@reqres.in", "first_name": "Charles", "last_name": "Morris", "avatar": "https://reqres.in/img/faces/5-image.jpg" }, 
      { "id": 6, "email": "tracey.ramos@reqres.in", "first_name": "Tracey", "last_name": "Ramos", "avatar": "https://reqres.in/img/faces/6-image.jpg" } ]


      let n=userList.length-1;
      console.log(n);
for(let i=0; i<=n; i++){
    const main_container = document.getElementById('main_container');
    const div_container=document.createElement('div');
    div_container.className="card";
    const img_container=document.createElement('img');
    img_container.src=userList[i].avatar;
    const h4_elem=document.createElement('h4');
    h4_elem.innerText=`${userList[i].first_name} ${userList[i].last_name}`;
    const p_elem = document.createElement('p');
   p_elem.innerText=`Email: ${userList[i].email}`;
   div_container.appendChild(img_container);
   div_container.appendChild(h4_elem);
   div_container.appendChild(p_elem);
   main_container.appendChild(div_container);
}
