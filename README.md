# FoodBox project
- to connect to the database use localhost:54320 username:foodbox, password: foodbox
- to start phpPgAdmin http://localhost:30000/ username:foodbox, password: foodbox
- To run the application using a remote database on the Heroku host, you need to set the VM options in the startup parameters: -Dspring.profiles.active = heroku
#API
##ItemTypes
- get all item categories by item type id

GET

http://localhost:8080/item-types/{id}/categories

Response:

     {
       [
         {
           "id": 1,
           "name": "category name",
           "description": "some description of category"
         },
         {
           "id": 2,
           "name": "category name",
           "description": null
         }
       ]
     } 

- add new items type    
 
POST

http://localhost:8080/item-types

Request:

     {
      "name": "items type name",
      "description": "items type description",
      "restaurantId": 1
     }
     
Response:
     
     {
      "id": 1,
      "name": "items type name",
      "description": "items type description",
      "restaurantId": 1
     } 
         
##ItemCategory
- get all items from category by category id

GET

http://localhost:8080/item-categories/{id}/items
  
Response:

    {
      [
       {
         "id": 1
         "name": "first item name",
         "description": "string"
        },
       {
         "id": 2
         "name": "second item name",
         "description": "string"
        } 
      ]
    }
    
- add new items category    
 
POST

http://localhost:8080/item-categories

Request:

     {
      "name": "items category name",
      "description": "items category description",
      "itemTypeId": 1
     }
     
Response:
     
     {
      "id": 1,
      "name": "items category name",
      "description": "items category description",
      "itemTypeId": 1
     }     
 
##Item
- get Item by id

GET

http://localhost:8080/item-categories/{id}/items 

Response:

    {
      "id": 1
      "name": "item name",
      "description": "string"
    }
    
##Restaurant
- get restaurant full info by id

GET

http://localhost:8080/restaurants/{id}

Response:

    {
      "id": 1,
      "name": "restaurant name",
      "phoneNumber": "+37529XXXXXXX",
      "description": "some description",
      "photoUrl": null,
      "email": "example@gmail.com",
      "address": {
                   "id": 1,
                   "address": "ул. Неизвестная 60"
                   "city": {
                             "id":1,
                             "name": "Минск",
                             "country": {
                                          "id": 1,
                                          "name": "Беларусь",
                                          "abbreviation": "BY"
                                        }  
                           }
                  }
      "hours": {
                  "regularOpens": 08:00,
                  "regularCloses": 21:00
               }                        
    }
    
- get all restaurant item types by restaurant id with pagination

GET

http://localhost:8080/restaurants/{id}/item-types?start=0&limit=3

Response:

    {
      [
      {
        "id": 1,
        "name": "first item type name",
        "description": "some descriptiom"
      },
      {
        "id": 2,
        "name": "secomd item type name",
        "description": "some descriptiom"
      },
      {
        "id": 3,
        "name": "third item type name",
        "description": null
      },
      ],
      "pageCount": 10
    }    