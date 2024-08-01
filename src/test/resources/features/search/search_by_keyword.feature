Feature:Login with another user

  Background:
    Given I access kyotviet
@SC02
  Scenario: Searching for a term
    When I check login with infomation in table below
      | Username   | Password | Resuilt                                   |
      |            | a        | Bạn hãy nhập đầy đủ thông tin các trường! |
      | a          | a        | Sai tên đăng nhập hoặc mật khẩu.          |
      | 0790994442 | 311849   | Thành công                                |


