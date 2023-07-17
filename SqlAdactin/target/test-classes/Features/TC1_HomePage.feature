Feature:  Verifying zaavi application homepage

Scenario Outline: Verifying Zavvi homepage by searching valid credential


@Given User is on homeage of zaavi
@When User should enter in search box "<searchProduct>","<model>"
@Then User should verify item displayed
@And User should click on item displaed


Examples:
|searchProduct|model|
|iphone|14 pro|