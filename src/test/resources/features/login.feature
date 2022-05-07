#language: pt

@login
Funcionalidade: Login
  Eu como usuario do sistema
  Quero fazer login
  Para fazer uma compra no site

  Contexto: Tela de Login
    Dado que estou na tela de login

  @loginSucesso
  Cenario: Login com sucesso
    Quando forneco as informações login e senha
      | e-mail | eduardo.finotti@qazando.com |
      | senha  | 123456                      |
    E clico em Login
    Entao deve ser logado na aplicacao

  @loginCamposVazios
  Esquema do Cenario: Login <identificacao>
    Quando forneco as informações login e senha
      | e-mail | <e-mail> |
      | senha  | <senha>  |
    E clico em Login
    Entao deve ser mostrar uma mensagem de erro
      | mensagem | <mensagem> |

    Exemplos:
      | identificacao      | e-mail                      | senha  | mensagem         |
      | com o e-mail vazio |                             | 123456 | E-mail inválido. |
      | com a senha vazia  | eduardo.finotti@qazando.com |        | Senha inválida.  |

