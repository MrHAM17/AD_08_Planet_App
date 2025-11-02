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
