# Realize hanoi tower


def move_disk(fp, tp):
    print('moving disk from', fp, ' to ', tp)


def move_tower(height, from_pole, to_pole, with_pole):
    if height >= 1:
        move_tower(height - 1, from_pole, to_pole, with_pole)
        move_disk(from_pole, to_pole)
        move_tower(height - 1, with_pole, to_pole, from_pole)


move_tower(3, 'A', 'B', 'C')