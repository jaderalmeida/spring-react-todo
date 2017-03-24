# spring-react-todo
Todo List com React JS e Java Spring Boot

## client-react setup:

    $ cd client-react/ && npm run-script build
    $ npm start 
    
   O comando npm start irá subir a aplicação react em um servidor de testes na porta 3000.

## server-spring setup:

   Para testar o projeto Server Spring (Rest Api) basta importar o projeto no Eclipse e importá-lo como um Projeto Maven, apos isso executar o ApiRestApplication.java como um Java Application, o server irá subir na porta 8080.

## database setup:

   O projeto utilizou como servidor de banco de dados o MariaDB. Para criar a base de dados:
    
    create database dbtodo;
    mysql -uroot -p --default-character-set=utf8 dbtodo < dbtodo.sql
   
   Após isso basta importar o arquivo dbtodo.sql disponível na pasta database.
