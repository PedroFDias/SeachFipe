# 📦 SearchFipe - Consumindo FIPE API

Este projeto é uma aplicação Java (ou a linguagem que você usou) que permite consultar informações detalhadas sobre veículos utilizando a **FIPE API**. O programa faz uma requisição HTTP para a API e retorna dados como **marca, modelo, ano e preço médio** de veículos.

O objetivo do projeto é demonstrar o uso da FIPE API para consultar informações sobre veículos de forma simples e eficiente, além de mostrar boas práticas na manipulação de requisições HTTP.

## 🚀 Tecnologias utilizadas
- **Java 11+** (ou a linguagem utilizada)
- **Spring Boot** 
- **FIPE API** (para consultar informações sobre veículos)
- **java.net.http** (para consumir a API)

## 📌 Funcionalidades
✅ Consulta de informações detalhadas sobre **veículos** a partir de **marca, modelo e ano**  
✅ Retorno de dados como **marca, modelo, ano e preço**  
✅ Tratamento de erros para **informações inválidas ou inexistentes**  
✅ Estrutura simples e fácil de entender  

## 🔧 Como executar
1. **Clone este repositório:**  
   ```bash
   git clone https://github.com/PedroFDias/SeachFipe.git
2. **Abra** o projeto em sua IDE favorita (IntelliJ, Eclipse, VS Code, etc.)
3. **Verifique** se tem Java 11 ou superior instalado
4. **Compile e execute** o programa.
   
## 📖 Exemplo de uso
Após rodar o programa, o usuário pode fornecer uma marca ou modelo de veículo. Exemplo de uso com Carro:
Usuário insere um CEP:  
```
 *************************OPÇÕES*******************************
 - Car
 - Motorcycles
 - Trucks
 Inform one the options: Car
```
Saída esperada:
```
Data[cod=1, mark=Acura]
Data[cod=10, mark=Cadillac]
Data[cod=11, mark=CBT Jipe]
Data[cod=12, mark=Chrysler]
Data[cod=120, mark=Walk]
Data[cod=123, mark=Bugre]
Data[cod=125, mark=SSANGYONG]
Data[cod=127, mark=LOBINI]...
```
O usuário fornecer ou modelo de veículo. Exemplo de uso com codico 21: 
```
**************************************************************
Inform the automobile model: 21
```
Saída esperada:  
```
**************************************************************
Models this mark:
Data[cod=10065, mark=Stilo Dualogic 1.8 ATTRACTIVE Flex 8V 5p]
Data[cod=10069, mark=Toro Freedom 2.0 16V 4x4 TB Diesel Aut.]
Data[cod=10070, mark=Toro Ranch 2.0 16V 4x4 TB Diesel Aut.]
Data[cod=10071, mark=Toro Ultra 2.0 16V 4x4 TB Diesel Aut.]
Data[cod=10101, mark=Fastback Audace 1.0 200 T. Flex Aut]
Data[cod=10102, mark=Fastback Impetus 1.0 200 T. Flex Aut]
Data[cod=10103, mark=Fastback Limited Ed.1.3 270 T.Flex Aut.]
```
O usuário informa um trecho do nome do carro, exemplo com stilo: 

```
**************************************************************
Enter a third of the car's name: stilo
```
Saída esperada:
```
**************************************************************
filtered models: 
Data[cod=5064, mark=Stilo 1.8 ATTRACTIVE Flex 8V 5p]
Data[cod=597, mark=Stilo 1.8 MS Lim.Edit./ MS Season 16V]
Data[cod=4187, mark=Stilo 1.8 SP Flex 8V 5p]
Data[cod=4329, mark=Stilo 1.8 Sporting Flex 8V 5P]
Data[cod=596, mark=Stilo 1.8/ 1.8 Connect 8V 103cv 5p]
Data[cod=3813, mark=Stilo 1.8/ 1.8 Connect Flex 8V 5p]
Data[cod=598, mark=Stilo 1.8/ 1.8 SP/ Connect 16V 122cv 5p]
Data[cod=599, mark=Stilo 2.4 Abarth 20V 167cv 5p]
Data[cod=10065, mark=Stilo Dualogic 1.8 ATTRACTIVE Flex 8V 5p]
Data[cod=4862, mark=Stilo Dualogic 1.8 BlackMotion Flex 8V]
Data[cod=4529, mark=Stilo Dualogic 1.8 Flex 8V 5p]
Data[cod=4530, mark=Stilo Dualogic 1.8 SP Flex 8V 5p]
Data[cod=4531, mark=Stilo Dualogic 1.8 Sporting Flex 8V 5p]
```
Usuário informa o codico do carro que deseja pesquisar:
```
**********************
Type a model code for search the evaluation's values: 5064
```
Saída esperada:
```
Model: Stilo 1.8 ATTRACTIVE Flex 8V 5p
Mark: Fiat
Value: R$ 20.964,00
Year Model: 2010
Type Fuel: Gasolina
```

## 🛠 Tecnologias e principais classes utilizadas
- `HttpClient` → Para enviar requisições HTTP
- `HttpRequest` → Para criar a requisição GET
- `HttpResponse` → Para manipular a resposta da API
- `Spring Boot` → Framework principal para desenvolvimento  
- `URI` → Para definir a URL da FIPE API
  
## 📜 Licença
Este projeto é de código aberto e está licenciado sob a **MIT License**.
