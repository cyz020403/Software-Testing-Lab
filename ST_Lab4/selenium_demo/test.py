from selenium import webdriver
from selenium.webdriver.chrome.service import Service

# 指定浏览器驱动程序的路径
service = Service('C:\chromedriver.exe')
driver = webdriver.Chrome(service=service)

# 网页地址
# http://127.0.0.1:9999/login
driver.get('http://127.0.0.1:9999/login')

# elem = driver.find_element_by_id('signupForm')
elem = driver.find_element('id', 'signupForm')
text = elem.text
print(text)

driver.quit()