from selenium import webdriver
from selenium.webdriver.chrome.service import Service
import time
from selenium.webdriver.common.by import By

# 指定浏览器驱动程序的路径
service = Service('C:\chromedriver.exe')
driver = webdriver.Chrome(service=service)

# 网页地址
# http://127.0.0.1:9999/login
driver.get('http://127.0.0.1:9999/login')

# elem = driver.find_element('id', 'signupForm')
# text = elem.text
# print(text)

username_input = driver.find_element('name', 'username')
username_input.send_keys('admin')

password_input = driver.find_element('name', 'password')
password_input.send_keys('admin123')

login_button = driver.find_element('id', 'btnSubmit')
login_button.click()

time.sleep(1)

driver.get('http://127.0.0.1:9999/system/user')

# sleep 3 seconds
time.sleep(1)

driver.save_screenshot("itcast.png")

# 找到具有特定ID的表格元素
# table = driver.find_element_by_id("table-id")
table = driver.find_element("id", "bootstrap-table")

# 找到表格中的所有行
rows = table.find_elements(By.TAG_NAME, "tr")

# 遍历每一行，并找到行中的所有单元格
for row in rows:
    cells = row.find_elements(By.TAG_NAME, "td")
    
    # 遍历每一个单元格，并打印单元格中的文本
    for cell in cells:
        print(cell.text)

driver.quit()