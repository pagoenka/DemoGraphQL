Original Code Repo - https://github.com/eh3rrera/graphql-java-spring-boot-example

I have made few small changes to make it work. 

To start application Run DemoGraphQlApplication.java

It uses in memory H2 database. You can change port in Application.properties file

Access H2 database at 
http://localhost:8081/h2-console/login.jsp

- JDBC URL - jdbc:h2:mem:testdb
- username - sa
- password - keep blank


Local graphql url
http://localhost:8081/graphql

Local graphql schema
http://localhost:8081/graphql/schema.json

Use graphiQL for testing - https://github.com/graphql/graphiql

## Request Payload

### findAllBooks
    {
      findAllBooks {
        id
        isbn
        title
        pageCount
        author {
          firstName
          lastName
        }
      }
    } 

### findBookById
    {
      findBookById(id:12)  {
        id
        isbn
        title
        pageCount
        author {
           firstName
           lastName
         }
      }
    }

### countBooks
    {
      countBooks
    }

### Add new book (mutation)
    mutation {
      newBook(title: "Java: The Complete Reference, Tenth Edition", isbn: "1259589331", author: 1) {
        id
        title
      }
    }
    
### Update book page count
    mutation {
      updateBookPageCount(pageCount: 1500, id: 2) {
        id
        pageCount
      }
    }
    
### Delete Book

    mutation {
      deleteBook(id: 2)
    }