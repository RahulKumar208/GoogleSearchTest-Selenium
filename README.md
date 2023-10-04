# Google Search End-to-End Test

This repository contains a browser-based end-to-end test for Google Search.

## Prerequisites

- Java JDK
- Maven
- ChromeDriver (download and set path)

## Running the Test

1. Clone this repository.
2. Navigate to the repository directory.
3. Run the test using one of the following commands:

   For Unix-like systems:

   ```bash
   ./start.sh

## Manually Run
1. Navigate to "https://www.google.com/".
2. Determine whether a cookie consent banner is present, and if so, either accept or reject it.
3. Enter a search query in the search bar and initiate the search by clicking "Submit" or pressing "Enter."
4. Confirm if the search results are visible on the page.
5. Click on the first search result, which is a website link.
6. Validate whether you have been redirected to a different website.
7. Verify the redirection to the new website using assertions or checks as needed.
