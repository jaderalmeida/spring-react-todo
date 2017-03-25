# spring-react-todo
Todo List com React JS e Java Spring Boot

## client-react setup:

    $ cd web-react/ && npm install
    $ npm start

   O comando npm start irá subir a aplicação react em um servidor de testes na porta 3000.

## server-spring setup:

   Para testar o projeto Server Spring (Rest Api) basta importar o projeto no Eclipse e importá-lo como um Projeto Maven, apos isso executar o ApiRestApplication.java como um Java Application, o server irá subir na porta 8080.

## database setup:

   O projeto utilizou como servidor de banco de dados o MariaDB. Para criar a base de dados:

    create database dbtodo;

   Após isso basta importar o arquivo dbtodo.sql disponível na pasta database.

    mysql -uroot -p --default-character-set=utf8 dbtodo < dbtodo.sql

## info:

  Desenvolvido com Fedora 25
  IDE: Eclipse Neon
  Editor: Atom
  Back-end: Maven + Spring Boot
  Front-end: ReactJS
  Banco de Dados: MariaDB
  
## puc minas - engenharia de software
   
   trabalho final arquitetura de aplicação web

    alunos:
        Fernando Borges
        Jader Almeida
        Yghor Pereira
        Mário Victor
