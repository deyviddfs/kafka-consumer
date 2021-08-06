<h1 align="center">Kafka Consumer</h1>

Descrição
=================
<p align="center">Exemplo de implementação de um micro serviço consumidor de mensagens para o kafka utilizando o Spring Boot.</p>

<p align="center">
  <img alt="GitHub branch checks state" src="https://img.shields.io/github/checks-status/deyviddfs/kafka-consumer/main">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/deyviddfs/kafka-consumer">
  <img alt="GitHub contributors" src="https://img.shields.io/github/contributors/deyviddfs/kafka-consumer">
  <img alt="Twitter URL" src="https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Ftwitter.com%2Fdeyviddfs">
</p>

Índice
=================
<!--ts-->
- [Descrição](#descrição)
- [Índice](#índice)
- [Como Usar](#como-usar)
- [Testes](#testes)
- [Status](#status)
<!--te-->


Como Usar
=================

#Pré Requesitos
* Java 14
* Docker instalado

#Subindo Aplicação
* Clonar repositório
* Navegar até a pasta do arquivo docker-compose.yml
* Rodar comando <b>docker-compose up -d</b>
* Validar se foi tudo criado e está UP com o comando <b>docker-compose ps</b>
* Abrir o projeto cadastro-consumer
* Subir as duas aplicações através da classe SpringApplication



Testes
=================
* Criar tópico com 3 partições
    <p>
        docker exec -ti broker ../../bin/kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3 --topic DEV.CUSTOMER
    </p>

* Subir a aplicação

* Produzir uma mensagem
    <p>
        docker exec -ti broker ../../bin/kafka-console-producer --broker-list localhost:9092 --topic DEV.CUSTOMER
    </p>

* Resultado esperado
    <p>
        1- A mensagem cair em apenas um dos métodos da classe CustomerOneConsumer
        2- A mensagem cair nos dois métodos da classe CustomerTwoConsumerGroup
    </p>

Status
=================
<h4 align="center"> 
	🚧  kafka - Em construção...  🚧
</h4>