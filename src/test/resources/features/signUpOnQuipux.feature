Feature: signup on quipux

  as a user I want to validate the sign up behaviour on quipux digital

  Scenario: correct signup on quipux
    Given I open the web quipux digital
    When I create an account on quipux
    Then I must be redirected to main page

  Scenario Outline: validate sign up behaviour for form
    Given I open the web quipux digital
    When I enter email "<email>" and password "<password>"
    Then the user should see the message "<message>"
    Examples:
      | email                 | password          | message                                 |
      |                       | 16151326-tesTinG* | Escriba una dirección de correo válida. |
      | testuser2@yopmail.com | 16151326-         | Agrega letras minúsculas                |
      | testuser3             | 16151326-tesTinG* | Escriba una dirección de correo válida. |

