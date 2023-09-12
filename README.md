
# Projeto FullStack feito para matéria de Engenharia de Software na UFU
Bom, o projeto é feito em Clojure, com algumas bibliotecas para auxiliar na criação do site de maneira mais rápida, como por exemplo, para o frontend, estou utilizando ClojureScript com re-frame (a configuração do shadowcljs é um pouco chatinha, provavelmente explico isso quando finalizar), utilizarei também bibliotecas para as requisições http já que será incrementado no código em algum momento a API criada para salvar pedidos, não falei sobre isso ainda, porém esse projeto é basicamente uma Pizzaria virtual (um iFood, mas só de pizzas).


## Rodar o projeto

Depois de clonar o repositório, é necessário que você possua um gerenciador de pacotes JavaScript, de preferência `yarn`, que foi o utilizado para a criação dos scripts como você pode ver no `package.json`. Após isso, rode o seguinte comando 

- yarn
```bash
  yarn

  yarn dev
```
- npm
```bash
  npm install

  npm run dev
```
O projeto estára agora rodando na posta `8280`, você pode trocar se preferir, é necessário apenas que altere no arquivo `shadow-cljs.edn`, altere a keyword `:dev-http` para quaisquer você queira.

## Testes

Para os testes utilizarei o karma (provavelmente criarei os testes assim que eu subir a API).
