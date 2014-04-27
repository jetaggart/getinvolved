require "test_helper"

class CreatingAStoryTest < Capybara::Rails::TestCase
  test "a visitor can create a story" do
    visit root_path

    click_on "Begin A Story"

    fill_in "Name", :with => "Johnny Appleseed"
    fill_in "Email", :with => "johnny@appleseed.com"
    fill_in "user_password", :with => "password"
    fill_in "Password confirmation", :with => "password"

    click_on "Create User"

    fill_in "Describe your story", :with => "I want to plant seeds."

    click_on "Create Story"

    assert_content "Story has been created"
  end
end
