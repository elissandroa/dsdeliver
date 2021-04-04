# DS Deliver
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/elissandroa/dsdeliver/blob/main/LICENSE) 

# Sobre o projeto

https://sds2-dsdelivery.netlify.app/

Ds Deliver é uma aplicação full stack web e mobile construída durante a 2ª edição da **Semana DevSuperior** (#sds2), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em aplicativo de pedidos onde os dados são coletados no app web, e depois são listados no app mobile, onde o entregador tem uma  listagem dos pedidos pendentes, e ao selecionar o pedido
é traçado uma rota para a entrega usando google maps.

## Layout mobile
![Mobile 1](https://github.com/elissandroa/assets/blob/main/assets/front-mobile-dsdelivery-1.png) ![Mobile 2](https://github.com/elissandroa/assets/blob/main/assets/front-mobile-dsdelivery-3.png)
![Mobile 3](https://github.com/elissandroa/assets/blob/main/assets/front-mobile-dsdelivery-2.png)
## Layout web
![Web 1](https://github.com/elissandroa/assets/blob/main/assets/front-web-dsdelivery-1.png)

![Web 2](https://github.com/elissandroa/assets/blob/main/assets/front-web-dsdelivery-2.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/elissandroa/assets/blob/main/assets/modelo-conceitual-dsdeliver.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/elissandroa/dsdeliver.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/elissandroa/dsdeliver.git

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Elissandro Aparecido Anastácio

https://www.linkedin.com/in/elissandroa/

