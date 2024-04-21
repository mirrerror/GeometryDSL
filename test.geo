point p1 = (100, 200);
point p2 = (300, 400);
line l1 = from (p1) to (p2);
point p3 = (500, 600);
print(distance(p1, p2));
print(distance(p1, p3));
print(p1);
x = 500;
y = 700;
print(x);
print(y);
point p3 = (x, y);
print(p3);
line l2 = from (x, y) to (x, y);
print(l2);

rectangle r1 = (p1, 100, 200);
print(r1);
triangle t1 = (p1, p2, p3);
print(t1);
polygon poly = (100, 400, 200, 800);
print(poly);

i = 0;
while(i < 24) {
    i = i + 8;
    print(i);
}

e = 2.66;
if(i == 24) {
    print(i);
} else {
    print(e);
}

for(i = 1; i <= 10; i = i + 1) {
    print(i);
}