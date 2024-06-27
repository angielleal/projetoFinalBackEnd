README.md

Projeto de Saúde e Bem-estar

Descrição

Este projeto foi desenvolvido como parte de um trabalho final para criar uma API RESTful usando Spring. O objetivo é gerenciar medicamentos e prescrições médicas, proporcionando uma solução eficiente para clínicas e hospitais. A aplicação permite o cadastro, visualização, atualização e remoção de medicamentos, pacientes e prescrições.

Componentes do Grupo

- Angiel Leal
- Mateus Zanin Fernandes

Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- H2 Database
- Docker

Estrutura do Projeto

Entidades

1. **Medicamento**
   - `id`: Identificador único do medicamento
   - `nome`: Nome do medicamento
   - `fabricante`: Fabricante do medicamento

2. **Paciente**
   - `id`: Identificador único do paciente
   - `nome`: Nome do paciente
   - `cpf`: CPF do paciente

3. **Prescrição**
   - `id`: Identificador único da prescrição
   - `paciente`: Referência ao paciente
   - `medicamento`: Referência ao medicamento
   - `dosagem`: Dosagem prescrita

Casos de Uso

- **Gerenciamento de Medicamentos**: Permite o cadastro, visualização, atualização e remoção de medicamentos.
- **Gerenciamento de Pacientes**: Permite o cadastro, visualização, atualização e remoção de pacientes.
- **Gerenciamento de Prescrições**: Permite a criação, visualização, atualização e remoção de prescrições, associando pacientes e medicamentos.

Como Executar o Projeto

Pré-requisitos

- Docker instalado

Passos

1. Clone o repositório:
  
   git clone https://github.com/angielleal/projetoFinalBackEnd.git
   
2. Execute o Docker:

docker-compose up
A aplicação estará disponível em http://localhost:8080.

- Link DockerHub https://hub.docker.com/r/mateuszanin/my-image

- Endpoints da API

*Medicamentos
GET /medicamentos: Retorna todos os medicamentos.
curl -X GET http://localhost:8080/medicamentos

POST /medicamentos: Adiciona um novo medicamento.
curl -X POST http://localhost:8080/medicamentos -H "Content-Type: application/json" -d '{"nome": "Paracetamol", "fabricante": "XYZ"}'

GET /medicamentos/{id}: Retorna um medicamento por ID.
curl -X GET http://localhost:8080/medicamentos/1

DELETE /medicamentos/{id}: Remove um medicamento por ID.
curl -X DELETE http://localhost:8080/medicamentos/1

*Pacientes
GET /pacientes: Retorna todos os pacientes.
curl -X GET http://localhost:8080/pacientes

POST /pacientes: Adiciona um novo paciente.
curl -X POST http://localhost:8080/pacientes -H "Content-Type: application/json" -d '{"nome": "João Silva", "cpf": "12345678900"}'

GET /pacientes/{id}: Retorna um paciente por ID.
curl -X GET http://localhost:8080/pacientes/1

DELETE /pacientes/{id}: Remove um paciente por ID.
curl -X DELETE http://localhost:8080/pacientes/1

*Prescrições
GET /prescricoes: Retorna todas as prescrições.
curl -X GET http://localhost:8080/prescricoes

POST /prescricoes: Adiciona uma nova prescrição.
curl -X POST http://localhost:8080/prescricoes -H "Content-Type: application/json" -d '{"paciente": {"id": 1}, "medicamento": {"id": 1}, "dosagem": "500mg"}'

GET /prescricoes/{id}: Retorna uma prescrição por ID.
curl -X GET http://localhost:8080/prescricoes/1

PUT /prescricoes/{id}: Atualiza uma prescrição.
curl -X PUT http://localhost:8080/prescricoes/1 -H "Content-Type: application/json" -d '{"paciente": {"id": 1}, "medicamento": {"id": 1}, "dosagem": "750mg"}'

DELETE /prescricoes/{id}: Remove uma prescrição por ID.
curl -X DELETE http://localhost:8080/prescricoes/1

- Arquitetura
Controllers: Lidam com as requisições HTTP.

MedicamentoController
PacienteController
PrescricaoController
AjudaController

Services: Contêm a lógica de negócios.

MedicamentoService
PacienteService
PrescricaoService

Repositories: Interagem com o banco de dados.

MedicamentoRepository
PacienteRepository
PrescricaoRepository

Models: Definem as entidades e suas propriedades.

Medicamento
Paciente
Prescricao

Contribuições
Sinta-se à vontade para abrir issues e pull requests. Contribuições são bem-vindas!

Licença
Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.

Este `README.md` fornece uma visão geral clara e detalhada do projeto, facili
