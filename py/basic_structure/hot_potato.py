# An interesting game like to pass the parcel in China, it is
# a modern-day equivalent of the famous Josephus problem.

from basic_structure import queue


def hot_potato(name_list, n):
    sim_queue = queue.Queue()
    for name in name_list:
        sim_queue.enqueue(name)

# Enqueue what it dequeues
    while sim_queue.size() > 1:
        for i in range(n):
            sim_queue.enqueue(sim_queue.dequeue())
        sim_queue.dequeue()

    # Remove the lucky person
    return sim_queue.dequeue()


print(hot_potato(["Bill", "David", "Susan", "Jane", "Kent", "Brad"], 7))