cmake_minimum_required(VERSION 4.2)
project(c C)

set(CMAKE_C_STANDARD 11)

add_executable(c main.c
        address_demo.c
        pointer_basic.c
        pointer_types.c
        " dereference_read.c"
        dereference_write.c
        pointer_flow.c
        pointer_mistake.c
        1.c
        2.c
        3.c
        4.c
        array_is_pointer.cpp
        array_is_pointer.c
        array_address.c
        pointer_arithmetic.c
        pointer_traverse.c
        string_pointer.c
        string_traverse.c
        array_pointer_all.c
)
