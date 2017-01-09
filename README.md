# thymeleaf-demo-01

This demo translates the following XML template from 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<breakfast_menu>
    <food>
        <name th:text="${item['name']}"></name>
        <price th:text="${item['price']}"></price>
        <description th:text="${item['description']}"></description>
        <calories th:text="${item['calories']}"></calories>
    </food>
</breakfast_menu>
```


to

```xml
<?xml version="1.0"?>
<breakfast_menu>
    <food>
        <name>Waffle</name>
        <price></price>
        <description></description>
        <calories></calories>
    </food>
</breakfast_menu>
```
