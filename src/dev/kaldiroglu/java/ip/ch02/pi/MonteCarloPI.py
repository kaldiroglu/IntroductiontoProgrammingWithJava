#
#  MonteCarloPI.py
#
#  Created by Akin Kaldiroglu on 2017.
#  Copyright 2017 JavaTurk. All rights reserved.

import math as m
import random as r
import time

# Total number of point to throw.
s = input("Please enter number of points: ")
n = int(s)

dotsInCircle = 0

start = time.time()
# Iterate for the number of darts.
for i in range(0, n):
  # Generate random x, y in [0, 1].
  x = r.random()
  y = r.random()
  # Increment if inside unit circle.
  if (x*x + y*y) < 1.0:
      dotsInCircle += 1

end = time.time()

# inside / total = pi / 4
pi = (float(dotsInCircle) / n) * 4

print("PI:            ", m.pi)
print("Calculated PI: ", pi)
seconds_elapsed = (end - start)
print("Time to calculate PI is ", seconds_elapsed, " s.")
