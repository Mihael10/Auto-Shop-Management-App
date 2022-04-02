

//Get Method
const api_url = "http://localhost:9999/modeli";

async function getapi(url) {
const response = await fetch(url);

var data = await response.json();
    console.log(data);
    if (response) {

    }
    show(data);
}
getapi(api_url);

function show(data) {
    let tab =
        `<tr>
          <th>Model ID</th>
          <th>Model Name</th>
          <<th>Color</th></th>
          <th>Price</th>
         </tr>`;

         for (let r of data) {
            tab += `<tr>
                <td>${r.modeli_id} </td>
                <td>${r.modeli_name}</td>
    <td>${r.color}</td>
    <td>${r.price}</td>
</tr>`;
}
document.getElementById("modeli").innerHTML = tab;
}

 // Post Method
  // Put Method
  // Delete Method