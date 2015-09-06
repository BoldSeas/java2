# encoding: UTF-8
require 'capybara/cucumber'
require 'capybara/mechanize'
require 'rspec'

Capybara.default_driver = :mechanize
Capybara.app = true
Capybara.app_host = "http://localhost:8080/"
