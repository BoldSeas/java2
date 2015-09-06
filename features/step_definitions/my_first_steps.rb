Given(/^I visit "([^"]*)"$/) do |url|
  visit url
end

Given(/^I click on "([^"]*)"$/) do |text|
  click_on text
end

When(/^I fill in "([^"]*)" with "([^"]*)"$/) do |field, text|
  fill_in field, with: text
end

Then(/^I will see "([^"]*)"$/) do |text|
  expect(page).to have_content(text)
end
