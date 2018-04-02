#!/usr/bin/python

import re

def derive():
    for i in range(len(deriv_list)):
        deriv_list[i] = deriv_list[i].split(' ')
        print(deriv_list[i])

    output = []
    output.append(deriv_list[0][0])
    html_out.write('<p>Non-terminal being expanded >> <b>BOLD</b>. </p>')
    html_out.write('<p> Derived expansion >> <u>UNDERLINE</u>.</p>')
    html_out.write('<p> tokens >> UPPER CASE.</p>')
    html_out.write('<p> Derived expansion >> lower case.</p>')
    new_deriv = (0, 0)
    for deriv in deriv_list:
        for i in range(len(output) - 1, -1, -1):
            if output[i] == deriv[0]:
                break
        print_out = output[:]
        output = output[:i] + deriv[2:] + output[i+1:]
        print_out[i] = '<b>' + print_out[i] + '</b>'
        print_out[new_deriv[0]] = '<u>' + print_out[new_deriv[0]]
        print_out[new_deriv[1]] = print_out[new_deriv[1]] + '</u>'
        html_out.write('<p>')
        html_out.write(" ".join(print_out))
        html_out.write('</p>\n')
        new_deriv = (i, i + len(deriv[2:]) - 1)





temp_txt = open("temp.txt")
html_out = open("output.html", 'w')
text = temp_txt.read()    

pattern = r"Action : Reduce rule \[(.*?)\]"
deriv_list = re.findall(pattern, text)
deriv_list.reverse()

derive()

temp_txt.close()
html_out.close()
