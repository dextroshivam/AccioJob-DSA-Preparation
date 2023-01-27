import time
import pyautogui
time.sleep(4)
count = 0
while count <= 1000:
    pyautogui.typewrite("You are cutie"+str(count))
    pyautogui.press("enter")
    count += 1
