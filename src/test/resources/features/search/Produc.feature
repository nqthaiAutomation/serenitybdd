Feature:Login with another user
  @SC01
  Scenario: tss
    Given I login kyotViet susserfully
    When I access menu "Hàng hóa->Danh mục"
    Then I verify header page is "Hàng hóa"

    When I select produce has code "TBDCN006"
    Then I verify button "Thao tác" displayed is "true"

    When I select produce has code "TBDCN006"
    Then I verify button "Thao tác" displayed is "false"

    When I select produce has code "TBDCN006"
    And I click button "Thao tác"




