require "spec_helper"

feature "Creating a Story" do
  scenario "a visitor creating a story" do
    visit root_path

    click_on "Begin A Story"

    fill_in "Name", :with => "Johnny Appleseed"
    fill_in "Email", :with => "johnny@appleseed.com"
    fill_in "user_password", :with => "password"
    fill_in "Password confirmation", :with => "password"

    click_on "Create User"

    fill_in "Name your story", :with=> "My Story Title"
    fill_in "Describe your story", :with => "I want to plant seeds."

    click_on "Create Story"

    expect(page).to have_content "Story has been created"
  end
end
