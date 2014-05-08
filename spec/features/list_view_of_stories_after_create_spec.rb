require "spec_helper"

feature "Creating a Story" do
  scenario "a visitor creating a story" do
    visit root_path

    click_on "Begin A Story"

    fill_in "Name", :with => "Lizzy Listview"
    fill_in "Email", :with => "listview@getinvolved.com"
    fill_in "user_password", :with => "password"
    fill_in "Password confirmation", :with => "password"

    click_on "Create User"

    fill_in "Name your story", :with=> "Best Story Title Ever"
    fill_in "Describe your story", :with => "After creating this, I want to see the stories list view."

    click_on "Create Story"

    expect(page).to have_content "Stories Index"
  end
end
