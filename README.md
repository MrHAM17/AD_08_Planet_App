## AD_08_Planet_App

### 📱 Short Description

Application showcasing a **Custom ListView** implementation to display **Planet details** (name, moon count, and image) in a customized layout.

---

### 🧩 Concepts Covered

* **Custom Adapter** (extending `ArrayAdapter<Planet>`)
* **Model Class** (`Planet`) (data structure for list items)
* Handling **Image Resources** (stored as `int` identifiers)
* **View Holder Pattern** (for optimizing view lookup/scrolling performance)
* **Array List** (dynamic data structure for storing model objects)
* **Item Click Listener** for ListView

---

### 🎯 Learning / Discovery Points

* Designing a modal class structure to encapsulate multiple pieces of data (String, String, Int for image) for a single list item.
* Using the **`Array List`** data structure to hold the `Planet` objects dynamically.
* Overriding the `getView` method within the custom adapter to inflate and populate the custom item layout.
* Accessing item data using `adapter.getItemAtPosition(position)` within the click listener.

---

### ⚙️ App Features / Usage

* Displays a scrollable list of planets.
* Each list item includes the planet's image, name, and moon count.
* Clicking an item triggers a Toast displaying the selected planet's name.

---

### 📝 Note

This project is crucial for mastering the construction of **complex list views** that involve more than just simple text, requiring custom adapters and model classes.

---

### Screenshots:
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/1%20Main%20Screen.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>ListView-ArrayAdapter
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/2.1%20ListView-ArrayAdapter.jpg" height="510" width="240">
</td> 
    <td align="center" style="width:50%;"> 
      <strong>Toast Message
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_08_Planet_App/blob/main/Result%20Pics/2.2%20Toast%20Message.jpg" height="510" width="240"> </td> </tr> </table>


