# spring-boot-intro-mq Spring Boot RabbitMQ Example


Things to be checked before starting the application:

* Start RabbitMQ in docker conteiner.
* docker run --name name-mq01 --hostname node-mq01 -p 5672:5672 -p 15672:15672 rabbitmq:3.8.2-management 
* Ensure that you have a rabbitmq server running and correctly configured in application.properties (default is localhost:5672) )


## Application flow:
 
* Swagger -> APP1 -> RabbitMQ -> Inventory -> Terminal 
* Send request to  http://localhost:8081/api/put_message
* A message is put in a rabbitmq queue
* This message is read and processed by MessageSender class in Inventory
* Message should arrive at Inventory  
* Message is displayed on terminal. 


## To do:

* Add FE APP1 (thymeleaf quick)
* Add (content: sku, item_description, qty_adjustment
** - item sold 
** + item return
* Add PosgreSQL (to inventory app)
* Add Inventory /api/items to listy QTY
* Add App1 /api/items to listy QTY to to fetch using feign inventory and present on screen
* Add FE to fetch items and QTY from inventory 
* Add App2
* Add refactor inventory to store WH1 & WH2 inventiory 
* Add local posgresSQL DBs x2 to WH1, WHh2 with local stock
* Refactor App1, App2 to show local stock 
* Add locgic to increase / decrease local stock and send message to Inventory 
* On the browser, keep refreshing the page: http://localhost:8080/product/show/1 
* You will notice that the value for "Are Messages Sent" changes to true in a second or so. 
