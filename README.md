<h1>Arquitetura de Microservices</h1>

## Descrição do Projeto
Projeto desenvolvido com foco em aprender mais sobre a arquitetura de microsserviços. Composto por um serviço de cadastro de 
usuário, que ao salvar este, envia dados desse usuário para uma fila de mensageria, para que o serviço de email que fica escutando a fila
possa realizar o disparo do e-mail de boas-vindas.

## Fluxo do Projeto
![image](https://github.com/ThaisRMBatista/MicroservicesUserEmail/assets/91470017/ad94c772-dbec-4166-b53b-809f64f46eb0)

## Tecnologias utilizadas
- Java 17
- Spring Boot
- API Rest
- Postgresql
- RabbitMQ
- SMTP Gmail
