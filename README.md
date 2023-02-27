# Agenda de Pessoas e Endereços


## Sobre o projeto

Usando Spring boot e JPA/HIBERNATE, foi criado uma API simples para gerenciar Pessoas. Esta API permite fazr todo processo CRUD com o banco de dados H2.
Foi adotado o modelo de camadas, onde os dados armazenados no Banco de Dados são acessados via requisições via web ( J-SON).
Temos duas classes de cadastro, uma para pessoas e outra para endereços, onde a aplicação permite criar uma coleção de endereços para uma mesma pessoa.
Adicionalmente foi criado uma classe de enumeração, onde cada registro de endereço recebe um tipo, podendo assim identificar qual endereço será o principal e qual será o residencial, trabalho, outro...


# Tecnologias utilizadas
## Back end
- Java SE 17.0.6.0 (LTS)
- Spring Boot 3.0.2 (LTS)
- JPA / Hibernate
- Maven
- Banco de dados H2

![image](https://user-images.githubusercontent.com/109438759/221582515-e8698c04-d33e-43d7-83c4-37d9a5022c88.png)

Fonte: Curso JAVA Completo 2023 - Prof. Nélio Alves. https://www.udemy.com/course/java-curso-completo/
