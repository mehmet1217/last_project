Feature: Dashboard Menu Bearbeitung

  Background:
    Given Der Benutzer ist sich in die Webseite angemeldet

  @wip
  Scenario Outline: Als ein Benutzer soll ich durch menu verschiedene Veränderungen tun
    Then Der Benutzer soll "<menu>" zufolge "<message>" lesen
    Examples:
      | menu           | message                                                               |
      | Edit Profile   | Let's get some information to make your profile stand out             |
      | Add Experience | Add any developer/programming positions that you have had in the past |
      | Add Education  | Add any school or bootcamp that you have attended                     |

