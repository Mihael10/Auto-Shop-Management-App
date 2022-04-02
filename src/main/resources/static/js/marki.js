
 //Get Method

  const api_url = "http://localhost:9999/marki";

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
            <th>Brand ID</th>
            <th>Brand Name</th>
            <<th>Country</th></th>
            <th>Eu</th>
            <th>Brand Image</th>
           </tr>`;

           for (let r of data) {
              tab += `<tr>
                  <td>${r.marki_id} </td>
                  <td>${r.marki_name}</td>
      <td>${r.country}</td>
      <td>${r.eu}</td>
      <td>${r.marki_img}</td>
  </tr>`;
  }
  document.getElementById("marki").innerHTML = tab;
  }

  // Post Method
  // Put Method
  // Delete Method